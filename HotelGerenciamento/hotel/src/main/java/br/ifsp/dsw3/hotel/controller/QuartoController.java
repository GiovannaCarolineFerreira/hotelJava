package br.ifsp.dsw3.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ifsp.dsw3.hotel.model.dao.QuartoDAO;
import br.ifsp.dsw3.hotel.model.domain.Quarto;

@Controller
@RequestMapping("/quartos")
public class QuartoController {

    @Autowired
    QuartoDAO dao;

    @GetMapping("/cadastrar")
    public String cadastrar(Quarto quarto) {
        return "/quarto/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap map) {
        map.addAttribute("quartos", dao.getAll());
        return "/quarto/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Quarto quarto) {
        dao.save(quarto);
        return "redirect:/quartos/cadastrar";
    }

    @GetMapping("/excluir/{numero}")
    public String excluir(@PathVariable("numero") int numero) {
        dao.delete(numero);
        return "redirect:/quartos/listar";
    }

    @GetMapping("/editar/{numero}")
    public String preEditar(@PathVariable("numero") int numero, ModelMap map) {
        map.addAttribute("quarto", dao.getByNumero(numero));
        return "/quarto/cadastro";
    }

    @PostMapping("/editar")
    public String editar(Quarto quarto) {
        dao.update(quarto);
        return "redirect:/quartos/listar";
    }
}