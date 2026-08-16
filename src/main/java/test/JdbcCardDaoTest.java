package test;
import dao.JdbcCardDao;
import domain.Card;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lyuba_cmpox5z
 */
public class JdbcCardDaoTest {
    private JdbcCardDao cardDao;

    @BeforeEach
    void setUp() {
        cardDao = new JdbcCardDao();
    }

    @Test
    @DisplayName("Перевірка списку карток з бази")
    void testGetAllCards() {
        assertDoesNotThrow(() -> {
            List<Card> cards = cardDao.getAll();
            assertNotNull(cards);
        });
    }

    @Test
    @DisplayName("Перевірка пошуку за неіснуючим ID")
    void testGetCardByIdNotFound() {
        assertDoesNotThrow(() -> {
            Optional<Card> card = cardDao.getById(-1);
            assertTrue(card.isEmpty());
        });
    }

    @Test
    @DisplayName("Перевірка об'єкта Card")
    void testCardEntity() {
        Card card = new Card();
        card.setCardId(1);
        card.setCardName("Test Card");
        card.setMadnessLevel(5);

        assertEquals(1, card.getCardId());
        assertEquals("Test Card", card.getCardName());
        assertEquals(5, card.getMadnessLevel());
    
}}
