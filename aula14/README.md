# Sistema para gestão de Agenda Telefônica

```mermaid
classDiagram
    
    class App {
        
    }
    
    class Agenda {
        
    }
    
    class Contato {
        
    }
    
    class Telefone {
        
    }
    
    class Email {
        
    }
    Agenda "1" *-- "0..*" Contato
    Contato "1" *-- "1..*" Telefone
    Contato "1" *-- "1..*" Email
    App "1" *-- "1" Agenda
```