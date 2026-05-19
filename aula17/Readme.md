# Java of Empires

```mermaid
classDiagram
    
    direction BT
    
    class Aldeao {
        
    }

    class Arqueiro {
        
    }
    
    class Cavaleiro {
        
    }
    
    class Boneco {
        <<abstract>>
        - int vida
        - int ataque
        - double velocidade
        + Boneco(int vida, int ataque, double velocidade)
        + String atacar()
        + String andar()
    }
    
    Aldeao --|> Boneco
    Arqueiro --|> Boneco
    Cavaleiro --|> Boneco
```