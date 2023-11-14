package br.ifsp.dsw3.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ifsp.dsw3.hotel.model.dao.Tipo_quartoDAO;
import br.ifsp.dsw3.hotel.model.domain.Tipo_quarto;

@Controller
@RequestMapping("/tipo_quartos")
public class Tipo_quartoController {

    @Autowired
    Tipo_quartoDAO dao;

    @GetMapping("/cadastrar")
    public String cadastrar(Tipo_quarto tipoQuarto) {
        return "/tipo_quarto/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap map) {
        map.addAttribute("tiposQuarto", dao.getAll());
        return "/tipo_quarto/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Tipo_quarto tipoQuarto) {
        dao.save(tipoQuarto);
        return "redirect:/tipo_quartos/cadastrar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id) {
        dao.delete(id);
        return "redirect:/tipo_quartos/listar";
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap map) {
        map.addAttribute("tipoQuarto", dao.getById(id));
        return "/tipo_quarto/cadastro";
    }

    @PostMapping("/editar")
    public String editar(Tipo_quarto tipoQuarto) {
        dao.update(tipoQuarto);
        return "redirect:/tipo_quartos/listar";
    }
}

