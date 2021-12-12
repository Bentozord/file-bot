package com.bentozord.reader

import spock.lang.Specification

class ScriptReaderSpec extends Specification {

    ScriptReader reader = new ScriptReader()

    def 'should get list of scripts from file'() {
        given: 'file that exists'
            def filePath = 'src/test/resources/script.json'
        when: 'reading file'
            def scripts = reader.readInput(filePath)
        then:
            !scripts.isEmpty()
    }
}
