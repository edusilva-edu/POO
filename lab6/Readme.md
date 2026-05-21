## Laboratório 6 - Relógios e cronometros

```mermaid

classDiagram
    
    class Relogio{
        
    }
    
    class Analogico{
        
    }
    
    class Digital{
        
    }
    
    class Cronometro{
        
    }
    
    class Display{
        
    }
    
    class Segmento{
        
    }
    
    class Digito{
        
    }
    
    Segmento "7" --* "1" Digito
    Digito "6" --* "1" Display
    
    Analogico --|> Relogio
    Digital --|> Relogio
    Digital ..|> Cronometro
    Digital *-- Display
    
```