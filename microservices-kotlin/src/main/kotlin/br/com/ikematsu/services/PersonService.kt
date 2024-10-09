package br.com.ikematsu.services

import br.com.ikematsu.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {

    private val counter: AtomicLong = AtomicLong()

    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findById(id: Long): Person {
        logger.info("Finding one person!" )

        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Ricardo"
        person.lastName = "Ikematsu"
        person.adress =  "Rua Augusto Rolim Loureiro 64"
        person.gender = "Male"
        return person

    }

    fun findAll(): List<Person> {
        logger.info("Finding all people!" )

        val persons: MutableList<Person> = ArrayList()
        for (i in 0..7) {
            val person = mockPerson(i)
            persons.add(person)
        }
        return persons

    }

    private fun mockPerson(i: Int): Person {
        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Person name $i"
        person.lastName = "Last name $i"
        person.adress =  "Some adress $i"
        person.gender = "Male"
        return person
    }
}