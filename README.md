# liquidacion_comisiones.github.io
En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que
requiere el gerente de ventas, para calcular el porcentaje de comisión a pagar de un 
asesor de acuerdo con la cantidad de ventas efectuadas durante el mes. Este negocio evalúa a los
vendedores de acuerdo a la cantidad de vehículos vendidos y basado en una tabla de pagos cacuula el valor a pagar


# ANALISIS DEL EJERCICIO

![Requerimiento](https://github.com/Diegosb05/liquidacion_comisiones.github.io/assets/133070932/ac456149-3125-499e-9f53-648063f8b2b0)

# CASOS DE USO

![Casos de uso](https://github.com/Diegosb05/liquidacion_comisiones.github.io/assets/133070932/e50c44ff-3456-41eb-9e2a-4fc2fc2bff7a)

Nombre: Calcular promedio de liquidación por asesor

Actores: gerente de ventas

Proposito: Guardar identificacion, nombre, venta efectuada, y el total se debe calcular por el 3%

Curso normal de eventos:

1. El gerente de ventas  ingresa la venta efectuada por el vendedor.

2. El gerente ingresa la identificacion, nombre, valor total de venta.

3. Se calcula el promedio a partir de:

    ((venta registrada) * número ingresado por el usuario%.

4. Se Muestra el promedio de pago de comisión

Postcondiciones: Promedio de ventas calculado

 

 

 

 

# SEUDOCODIGO

Inicio

    Caracteres: identificaciones [50], nombres [50], ventatotal [50]

    Tabla de pago: número ingresado por el usuario

    Caracteres: identificacion, nombre, venta total

    Entero: porcentaje de pago, i

    Real: 

    Imprimir: ‘Valor a pagar’

 

    finPara

    Para i=0 hasta numeroVendedores -1, 1

    promedio <-

    promedio +((vLunes[i]+vMartes[i]+vMiercoles[i]+vJueves[i]+vViernes[i])/5)numeroVendedores

    finPara

    Imprimir: ‘El promedio es:’ + promedio

Fin
