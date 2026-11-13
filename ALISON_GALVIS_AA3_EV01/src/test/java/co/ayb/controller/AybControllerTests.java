package co.ayb.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/** Pruebas de las solicitudes GET y POST del controlador AYB. */
@WebMvcTest(AybController.class)
class AybControllerTests {

    @Autowired
    private MockMvc mockMvc;

    /** GET / debe mostrar la página de inicio. */
    @Test
    void inicioMuestraIndex() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"));
    }

    /** GET /productos debe mostrar el formulario con un producto vacío. */
    @Test
    void formularioProducto() throws Exception {
        mockMvc.perform(get("/productos"))
               .andExpect(status().isOk())
               .andExpect(view().name("productos"))
               .andExpect(model().attributeExists("producto"));
    }

    /** POST /productos debe procesar el formulario y mostrar el resultado. */
    @Test
    void guardarProducto() throws Exception {
        mockMvc.perform(post("/productos")
                    .param("nombre", "Blusa")
                    .param("categoria", "Camisas")
                    .param("precio", "45000")
                    .param("cantidad", "3"))
               .andExpect(status().isOk())
               .andExpect(view().name("resultado-producto"))
               .andExpect(model().attribute("producto",
                       org.hamcrest.Matchers.hasProperty("nombre", org.hamcrest.Matchers.is("Blusa"))));
    }

    /** GET /clientes debe mostrar el formulario con un cliente vacío. */
    @Test
    void formularioCliente() throws Exception {
        mockMvc.perform(get("/clientes"))
               .andExpect(status().isOk())
               .andExpect(view().name("clientes"))
               .andExpect(model().attributeExists("cliente"));
    }

    /** POST /clientes debe procesar el formulario y mostrar el resultado. */
    @Test
    void guardarCliente() throws Exception {
        mockMvc.perform(post("/clientes")
                    .param("nombres", "Alison")
                    .param("apellidos", "Galvis")
                    .param("cedula", "123456789")
                    .param("telefono", "3001234567"))
               .andExpect(status().isOk())
               .andExpect(view().name("resultado-cliente"));
    }
}
