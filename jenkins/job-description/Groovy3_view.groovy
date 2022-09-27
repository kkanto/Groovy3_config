 
listView('Groovy3 Jobs') {
    description('Groovy3 Jobs')
    jobs {
        regex('Groovy3_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
