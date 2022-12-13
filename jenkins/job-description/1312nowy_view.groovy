 
listView('1312nowy Jobs') {
    description('1312nowy Jobs')
    jobs {
        regex('1312nowy_.+')
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
