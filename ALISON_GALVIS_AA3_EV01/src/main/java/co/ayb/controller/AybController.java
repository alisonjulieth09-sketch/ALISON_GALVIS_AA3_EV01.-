package co.ayb.controller;

import co.ayb.model.Cliente;
import co.ayb.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/** Controlador MVC de la Tienda de Ropa AYB. */
@Controller
public class AybController {

    /** Solicitud GET para mostrar el inicio. */
    @GetMapping("/")
    public String inicio() { return "index"; }

    /** Solicitud GET para mostrar el formulario de productos. */
    @GetMapping("/productos")
    public String formularioProducto(Model model) {
        model.addAttribute("producto", new Producto());
        return "productos";
    }

    /** Solicitud POST para procesar el formulario de productos. */
    @PostMapping("/productos")
    public String guardarProducto(@ModelAttribute Producto producto, Model model) {
        model.addAttribute("producto", producto);
        return "resultado-producto";
    }

    /** Solicitud GET para mostrar el formulario de clientes. */
    @GetMapping("/clientes")
    public String formularioCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clientes";
    }

    /** Solicitud POST para procesar el formulario de clientes. */
    @PostMapping("/clientes")
    public String guardarCliente(@ModelAttribute Cliente cliente, Model model) {
        model.addAttribute("cliente", cliente);
        return "resultado-cliente";
    }
}
