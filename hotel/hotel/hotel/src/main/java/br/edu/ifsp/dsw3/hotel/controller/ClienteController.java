package br.edu.ifsp.dsw3.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifsp.dsw3.hotel.model.dao.ClienteDao;
import br.edu.ifsp.dsw3.hotel.model.domain.Cliente;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteDao clienteDAO;

    @GetMapping("/cadastrar")
    public String cadastrar(Cliente cliente) {
        return "/cliente/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap map) {
        map.addAttribute("clientes", clienteDAO.getAll());
        return "/cliente/lista";
    }


    @PostMapping("/salvar")
    public String salvar(Cliente cliente) {
        clienteDAO.save(cliente);
        return "redirect:/clientes/cadastrar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id) {
        clienteDAO.delete(id);
        return "redirect:/clientes/listar";
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap map) {
        map.addAttribute("cliente", clienteDAO.getById(id));
        return "/cliente/cadastro";
    }

    @PostMapping("/editar")
    public String editar(Cliente cliente) {
        clienteDAO.update(cliente);
        return "redirect:/clientes/listar";
    }
}