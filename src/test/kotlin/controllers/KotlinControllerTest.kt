package controllers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.test.web.servlet.MockMvc

@AutoConfigureMockMvc
class KotlinControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `test for test`() {
        assertEquals(4+1, 5)
    }
}