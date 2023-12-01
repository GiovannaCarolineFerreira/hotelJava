package br.edu.ifsp.dsw3.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifsp.dsw3.hotel.model.dao.ReservaDao;
import br.edu.ifsp.dsw3.hotel.model.domain.Reserva;

@Controller
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    ReservaDao dao;

    @GetMapping("/cadastrar")
    public String cadastrar(Reserva reserva) {
        return "/reserva/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap map) {
        map.addAttribute("reservas", dao.getAll());
        return "/reserva/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Reserva reserva) {
        dao.save(reserva);
        return "redirect:/reservas/cadastrar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") int id) {
        dao.delete(id);
        return "redirect:/reservas/listar";
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") int id, ModelMap map) {
        map.addAttribute("reserva", dao.getById(id));
        return "/reserva/cadastro";
    }

    @PostMapping("/editar")
    public String editar(Reserva reserva) {
        dao.update(reserva);
        return "redirect:/reservas/listar";
    }
}
