package com.vijanaweusi.mitihaniapp

object  Constants {

    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Questions>{
        val questionList = ArrayList<Questions>()

        val question1 = Questions(
            1,
            "Mji mkuu wa TZ ni?",
            "Dar es Salam",
            "Zanzibar",
            "Dodoma",
            "Arusha",
            3)

        questionList.add(question1)


        val question2 = Questions(
            2,
            "Mji mkuu wa Kenya ni?",
            "Kisumu",
            "Mombasa",
            "Nakuru",
            "Nairobi",
            4)

        questionList.add(question2)


        val question3 = Questions(
            3,
            "Mji mkuu wa Ghana ni?",
            "Legos",
            "Accra",
            "Capetown",
            "Kingston",
            2)

        questionList.add(question3)


        val question4 = Questions(
            4,
            "Mji mkuu wa Togo ni?",
            "Lome",
            "Abuja",
            "Bamako",
            "Dakar",
            1)


        questionList.add(question4)


        val question5 = Questions(
            5,
            "Mji mkuu wa Senegal ni?",
            "Kigali",
            "Lusaka",
            "Dakar",
            "Niamey",
            3)


        questionList.add(question5)

        val question6 = Questions(
            6,
            "Mji mkuu wa Sudan Kusini ni?",
            "Khartoum",
            "Luanda",
            "Moroni",
            "Juba",
            4)


        questionList.add(question6)

        val question7 = Questions(
            7,
            "Mji mkuu wa Namibia ni?",
            "Maputo",
            "Windhoek",
            "Gaborone",
            "Kampala",
            2)


        questionList.add(question7)

        val question8 = Questions(
            8,
            "'Mji mkuu wa Gabon ni?",
            "Ouagadougou",
            "Libreville",
            "Harare",
            "Djibouti",
            2)


        questionList.add(question8)

        val question9 = Questions(
            9,
            " Mji mkuu wa Equatorial Guinea ni?",
            "Mogadishu",
            "Praia",
            "Kigali",
            "Malabo",
            4)


        questionList.add(question9)

        val question10 = Questions(
            10,
            " Mji mkuu wa Mali ni?",
            "Bamako",
            "Cairo",
            "Bangui",
            "Banjul",
            1)


        questionList.add(question10)



        return (questionList)
    }




    fun getQuestionsPili(): ArrayList<Questions>{
        val questionListTwo = ArrayList<Questions>()

        val question1 = Questions(
            1,
            "Baba wa taifa la Tanzania aliitwa nani?",
            "Marcus Garvey",
            "John Magufuli",
            "Juilus Nyerere",
            "Jomo Kenyatta",
            3)

        questionListTwo.add(question1)


        val question2 = Questions(
            2,
            "Patrice Lumumba alitokea wapi?",
            "Tanzania",
            "Ghana",
            "Cameroon",
            "Congo",
            4)

        questionListTwo.add(question2)


        val question3 = Questions(
            3,
            "Malize methali..Haraka Haraka haina..",
            "Kibaba",
            "Baraka",
            "chururu",
            "ndondondo",
            2)


        questionListTwo.add(question3)

        val question4 = Questions(
            4,
            "Shaaban bin Robert alikuwa..",
            "Raisi",
            "Doktari",
            "Mshairi",
            "Mwanariadha",
            3)


        questionListTwo.add(question4)

        val question5 = Questions(
            5,
            "Kuna wasemaji wengapi wa Kiswahili duniani?",
            "Takribani milioni 150",
            "Takribani milioni 250",
            "Takribani milioni 15",
            "Takribani milioni 95",
            1)


        questionListTwo.add(question5)



        val question6 = Questions(
            6,
            "Kuna wasemaji wengapi wa Kiswahili duniani?",
            "Takribani milioni 150",
            "Takribani milioni 250",
            "Takribani milioni 15",
            "Takribani milioni 95",
            4)


        questionListTwo.add(question6)


        val question7 = Questions(
            7,
            "Kuna wasemaji wengapi wa Kiswahili duniani?",
            "Takribani milioni 150",
            "Takribani milioni 250",
            "Takribani milioni 15",
            "Takribani milioni 95",
            4)


        questionListTwo.add(question7)


        val question8 = Questions(
            8,
            "Kuna wasemaji wengapi wa Kiswahili duniani?",
            "Takribani milioni 150",
            "Takribani milioni 250",
            "Takribani milioni 15",
            "Takribani milioni 95",
            4)


        questionListTwo.add(question8)


        val question9 = Questions(
            9,
            "Kuna wasemaji wengapi wa Kiswahili duniani?",
            "Takribani milioni 150",
            "Takribani milioni 250",
            "Takribani milioni 15",
            "Takribani milioni 95",
            4)


        questionListTwo.add(question9)


        val question10 = Questions(
            10,
            "Kuna wasemaji wengapi wa Kiswahili duniani?",
            "Takribani milioni 150",
            "Takribani milioni 250",
            "Takribani milioni 15",
            "Takribani milioni 95",
            4)


        questionListTwo.add(question6)





        return (questionListTwo)
    }
    fun getQuestionsTatu(): ArrayList<Questions>{
        val questionListTwo = ArrayList<Questions>()

        val question1 = Questions(
            1,
            "Malize methali hiyo..ndondondo si..?",
            "chururu",
            "mwendo",
            "kibaba",
            "sawa",
            1)

        questionListTwo.add(question1)


        val question2 = Questions(
            2,
            "Moja jumla moja sawasawa?",
            "Nne",
            "Tatu",
            "Moja",
            "Mbili",
            4)

        questionListTwo.add(question2)


        val question3 = Questions(
            3,
            "Malize methali..Haraka Haraka haina..",
            "Kibaba",
            "Baraka",
            "chururu",
            "ndondondo",
            2)


        questionListTwo.add(question3)





        return (questionListTwo)
    }
    fun getQuestionsNne(): ArrayList<Questions>{
        val questionListTwo = ArrayList<Questions>()

        val question1 = Questions(
            1,
            "Baba wa taifa la Tanzania aliitwa nani?",
            "Marcus Garvey",
            "Patrice Lumumba",
            "Juilus Nyerere",
            "Jomo Kenyatta",
            3)

        questionListTwo.add(question1)


        val question2 = Questions(
            2,
            "Moja jumla moja sawasawa?",
            "Nne",
            "Tatu",
            "Moja",
            "Mbili",
            4)

        questionListTwo.add(question2)


        val question3 = Questions(
            3,
            "Malize methali..Haraka Haraka haina..",
            "Kibaba",
            "Baraka",
            "chururu",
            "ndondondo",
            2)


        questionListTwo.add(question3)





        return (questionListTwo)
    }
}