package com.example.quizapp

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList=ArrayList<Question>()

        val que1=Question(1,
            "Which one is the first search engine in internet?",
            R.drawable.img_search,
            "Google",
            "Archie",
            "Altavista",
            "WAIS",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Number of bit used by the IPv6 address?",
            R.drawable.img_ipv6,
            "32 bit", "64 bit",
            "128 bit", "256 bit", 3
        )

        questionsList.add(que2)


        val que3 = Question(
            3, " Which one is the first web browser invented in 1990?",
            R.drawable.img_webbrowser,
            "Internet Explorer", "Mosaic",
            "Mozilla", "Nexus", 4
        )

        questionsList.add(que3)


        val que4 = Question(
            4, "First computer virus is known as",
            R.drawable.img_virus,
            "Rabbit", "Creeper Virus",
            "Elk Cloner", "SCA Virus", 4
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "Firewall in computer is used for",
            R.drawable.img_firewall,
            "Security", "Data Transmission",
            "Authentication", "Monitoring", 1
        )

        questionsList.add(que5)

        val que6 = Question(
            6, "Which of the following is not an operating system?",
            R.drawable.img_os,
            "DOS", "Mac",
            "C", "Linux", 3
        )

        questionsList.add(que6)

        val que7 = Question(
            7, "Which of the following is not a database management software?",
            R.drawable.img_database,
            "MySQL", "Oracle",
            "Sybase", "COBOL", 4
        )

        questionsList.add(que7)

        val que8 = Question(
            8, "Where is the headquter of Microsoft office located?",
            R.drawable.img_microsoft,
            "Texas", "NewYork",
            "California", "Washington", 4
        )

        questionsList.add(que8)

        val que9 = Question(
            9, "Computer Hard Disk was first introduced in 1956 by",
            R.drawable.img_hard,
            "Dell", "IBM",
            "Microsoft", "Apple", 2
        )

        questionsList.add(que9)

        val que10 = Question(
            10, "A folder in windows computer can't be made with the name",
            R.drawable.img_foldericon,
            "can", "con",
            "mak", "make", 2
        )

        questionsList.add(que10)
        return questionsList

    }
}