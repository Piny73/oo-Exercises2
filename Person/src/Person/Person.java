package Person;

public class Person { // immodificabile con l'aggiunta di final - non posso fare il metodo set!
   
private final String name;
private final int age;

public Person(String name, int age) {// Source Action costruttore
    this.name = name;
    this.age = age;
}

public String getName() {// Source Action get
    return name;
}
public int getAge() {
    return age;
}


@Override
public int hashCode() {// Source Action hashcode
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + age;
    return result;
}


@Override
public boolean equals(Object obj) { // Source Action equals
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Person other = (Person) obj;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (age != other.age)
        return false;
    return true;
}


@Override
public String toString() { // Source Action To String
    return "Person [nome=" + name + ", età=" + age + "]";
}  

}


