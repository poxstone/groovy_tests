// https://learnxinyminutes.com/docs/es-es/groovy-es/

def h = 'Hello world'
def x = 1

def d = new java.util.Date()
def f = 3.141516
def b = false

/* array */
def a = ['arbol', 'b', 1, 2, 'b']
a.add('3')
a << 4 // add and return
a.addAll(['c','d','e','f'])
a.remove('b')  // remove element
a = a - 'f'  // remove element

println h + ' - ' + " $x - $d - $f - $b - $a"

// iteration
a.each { println "a (iteration): $it"}
a.eachWithIndex { it, i -> println "a (iterarion indexed) $i: $it"}
a_contain_3 = a.contains( '3' )
a_contain_str = 'arbol' in a
println 'a_contain_3: ' + a_contain_3
println 'a_contain_str: ' + a_contain_str
a_contain_array = a.containsAll(['arbol','b'])
println 'a_contain_array: ' + a_contain_str

def m = [:]
m = ['a':'1', 'b':2, 'c':a, 'd':3]
m.put('d','4')
m.each { println "$it.key: $it.value" }
m.eachWithIndex { it, i -> println "$i: $it"}

// Evaluar si el mapa contiene una llave o valor 
a_contain_k = m.containsKey('a')
a_contain_v = m.containsValue(1)  // false, is might be same type
println "contains k: $a_contain_k - v: $a_contain_v"


class Foo {
  final String name = "Roberto"
  String language
  protected void setLanguage(String language) { this.language = language }
  def lastName
}


x = 3
if(x==3) {
  println "Three"
} else if(x==1) {
  println "One"
} else {
  println "X greater than Two"
}

// ternary - parentesis optional
def y = (x > 1) ? "worked" : "failed"
def z = y ?: "failed"
println "$y -- $z"

// iterator "for" opcional: i in [5,3,2,1]  OR map ['name':'Roberto']
def x2 = 0
for (i in 0 .. 30) {
  x2 += i
}
println "x2 : $x2"

// clousure (function)
def clos = { a1, b1 ->
  sleep(5) 
  println "Hello World! $a1 $b1"
}
clos('value_1', 'value_2')