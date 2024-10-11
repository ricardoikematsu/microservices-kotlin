package br.com.ikematsu.model

import jakarta.persistence.*

@Entity
@Table(name = "person")
data class Person (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "first_name", nullable = false, length = 80)
    var firstName: String = "",

    @Column(name = "last_name", nullable = false, length = 80)
    var lastName: String = "",

    @Column(name = "adress", nullable = false, length = 100)
    var adress: String = "",

    @Column(name = "gender", nullable = false, length = 6)
    var gender: String = ""

)