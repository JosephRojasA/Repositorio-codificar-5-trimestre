<?php
    echo "Ejemplo del uso de comando switch en PHP \n";
    $i = 2;
    switch($i)
    {
        case 1: //valor 1 y sentencias  
            echo "Uno";
            break;   
        case 2:
            echo "Dos";
            break;  
        case 3:
            echo "tres";
            break;  
        case 4:
            echo "Cuatro";
            break;  
        default: //sino corresponde con ninguno de los valores
            echo "Solo me programaron entre uno y cuatro \n";
    };

?>