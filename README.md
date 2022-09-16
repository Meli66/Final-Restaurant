# Restaurant

Enunciado del proyecto:

Un conocido restaurante nos pide realizar un programa para administrar su salón
comedor. El mismo cuenta con mesas, de las cuales conocemos el número, la cantidad
de personas que pueden sentarse y el estado (libre u ocupada).
También se nos informa que cuenta con un plantel de mozos. Cuenta además con varios
cocineros, de los que nos informan la cantidad de años de experiencia que tienen y varios
chefs, de los que conocemos el título que poseen (en caso de no poseer título oficial ese
dato estará vacío).
De todos los empleados del restaurante mencionados anteriormente, nos informan el
nombre, legajo y fecha de ingreso.
El restaurante cuenta con un menú en el cual figuran sus platos y bebidas. De cada uno
de estos conocemos el nombre y el precio. De los platos además nos dan su descripción,
un indicador que dice si es un plato vegano y otro que dice si es apto para celíacos. De
las bebidas nos informan además su tamaño en centímetros cúbicos y un indicador que
dice si tiene alcohol.
Cada vez que una mesa realiza un pedido al mozo, éste toma nota y lo ingresa en el
sistema anotando los siguientes datos: mesa a la que pertenece el pedido, mozo que la
atiende, cocinero que va a hacerse cargo del pedido, forma de pago (Efectivo, Crédito o
Débito) y los productos pedidos.
En el caso que una mesa realice el pago en efectivo se le hará un descuento que se
calculará de la siguiente forma: A los platos pedidos se les descontará un 5% salvo a los
platos veganos que no llevan descuento y en el caso de los platos aptos para celíacos
tendrán un 2% de descuento adicional. En el caso de las bebidas consumidas, el
descuento es de 10% para las que no contiene alcohol y de 3% en para las que si
contienen.
Basado en el enunciado descripto, realizar:
1. El diagrama de clases que lo modelice, con sus relaciones, atributos y métodos.
2. Crear un package de dominio con las clases que modelicen la solución y que
tengan solo propiedades, constructores, getters, setters, toString y si es necesario
equals y hashCode
3. Crear un package de servicio con las clases de negocio o servicio que sean
necesarias para la ejecución de los casos de test que se plantean debajo.
4. Crear los casos de Test.
