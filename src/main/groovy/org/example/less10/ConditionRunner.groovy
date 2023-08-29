package org.example.less10

class ConditionRunner {
    /**
     * boolean          is true
     * Collection/Map   is not empty
     * Matcher          has match
     * String/GString   is not empty
     * Number/Char      != 0
     * reference        != null
     *
     * asBoolean
     *
     */
    static void main(String[] args) {

        int x = 10
        if (x > 0) {
            println x
        }

        def person = new Person(12);
        if (person) println person.getId();

//        if (person != null) {
//            person.getId()
//        }

//        person?.getId()

//        def result = x != null ? x : 1
    }
}
