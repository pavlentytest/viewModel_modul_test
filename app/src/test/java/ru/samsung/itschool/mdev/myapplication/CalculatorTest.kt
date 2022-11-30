package ru.samsung.itschool.mdev.myapplication

import org.junit.Assert.*

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private var calculator: Calculator? = null

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @After
    fun tearDown() {
        calculator = null
    }

    @Test
    fun add() {
        Assert.assertEquals(4, calculator!!.add(1, 2).toLong())
    }
}