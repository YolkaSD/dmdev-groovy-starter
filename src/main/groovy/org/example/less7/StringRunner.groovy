package org.example.less7
// " "
// ' '
// """ """
// ''' '''
// / /
// $/ /$

def name = "Ivan"
def value = 'Hello "Hi!"'

def stringValue = "Hello $name"
println stringValue

def value2 = """
SELECT * 
FROM
table where name = ${getWithPrefix(name)}
"""

println value2


value3 = '''
SELECT * 
FROM
table where name = $name
'''

println value3

def value5 = /Hello word $name/
println value5

def value6 = $/Hello word $name/$
println value6

println name[2]
println name[-1]
println name[1..3]
println name * 3
println name - 'Iv'
println name - 'an'

static def getWithPrefix(String str) {
    "prefix-" + str
}