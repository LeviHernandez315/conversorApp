<h1 align="center"> Conversor de Monedas </h1>

<p align="center">vamos a explicar el proyecto del conversor de Monedas.<p>
<p align="center">Este proyecto tiene 4 clases que pasare a describir a continuación.<p>

<h2>Moneda</h2>
<p>Esta clase es un record que será el modelo de la información que se consumira por la API</p>
<p>Esta clase contiene solo 2 atributos, los cuales son:</p>
<p>El base_code, que es para definir el codigo de la moneda a convertir</p>
<p>El conversion_rate, que es una colección de varias monedas que equivalen a 1 en la moneda del base_code</p>
<p>cabe mencionar que el atributo conversion_rate es un Map, esto debido a que resulta mas facil manejar este Json por medio de llaves y valores</p>
![MonedaImagen](https://github.com/LeviHernandez315/conversorApp/assets/126931281/0a901103-24d7-4d8a-ad78-e19b93530db7)
<h2>Busqueda</h2>
<p>La clase Busqueda tiene una solo función que es la que consumira el API</p>
<p>En esta clase se encuentra los HttpClient, HttpRequest y HttpResponse, con su respectivo manejador de errores<p>
<p>Tambien contiene el Gson para la lectura del Json que traera el Http<p>
<p>Por ultimo, la función buscarMoneda tiene un parametro que es del tipo String, el cual sera el codigo de la moneda para su respectiva conversion<p>
![BusquedaImagen](https://github.com/LeviHernandez315/conversorApp/assets/126931281/6b6b0292-b8b2-40ee-b506-fa0211901afa)
<h2>Conversor</h2>
<p>Esta clase tiene una unica función, el cual espera 2 parametros: valorMoneda y valorEquivalenteDeLaMoneda<p>
<p>valorMoneda: será el numero de la moneda que se desea convertir<p>
<p>valorEquivalenteDeLaMoneda: es el valor equivalente en 1 de la moneda que se desa convertir, hacia la moneda a la cual se convertira<p>
<p>Al final se multiplicará el valorMoneda por el valorEquivalenteDeLaMoneda y se obtendra el resultado final de la moneda convertida<p>
![ConversorImagen](https://github.com/LeviHernandez315/conversorApp/assets/126931281/274a7522-b21a-4361-beb4-93c4aebac993)
<h2>Principal</h2>
<p>La clase Principal es la que tiene toda la logia importante ya que esta hará uso de las demas clases<p>
<p>En primer lugar tien la declaracion de variables y las instancias de las clases<p>
  ![decPrincipalImagen](https://github.com/LeviHernandez315/conversorApp/assets/126931281/7be2359c-8577-4010-9f27-a1de5856e1be)

<p>Luego tiene el ciclo while que se repetira hasta que el usuario coloque la opción de salir<p>
<p>Dentro del while hay un switch que contiene las distintas opciones, las cuales son los codigos bases de las monedas<p>
<p>El codigoOrigen: es el codigo base del cual se desea convertir<p>
<p>El codigoDestino: es el codigo de la moneda a la que se desea convertir<p>
<p>Cabe mencionar que hay una variable del tipo Scanner que espera el número de la opcion del switch, el cual tiene un manejador de errores para que los usuarios no puedan introducir valores no permitidos como el resto de caracteres no enteros<p>
  ![manejodeErroresPrincipal](https://github.com/LeviHernandez315/conversorApp/assets/126931281/afd30a57-cc66-4f8e-83f3-7160cf9857c8)

<p>Luego tiene un if el cual se ejecutara si la opcion es distinto de 15 o de 0<p>
<p>Esto debido a que no se quiere que el codigo se ejecute si el usuario no ha escogido una opcion apropiada<p>
<p>cabe mencionar que en la opcion default del switch, se le asigna el valor de 0 a la opcion para que no se ejecute el codigo dentro del condicional if<p>
<p>En este codigo tenemos otro ciclo while para el valor de la moneda que se desa convertir. También tiene un manejador de errores para que no se introduzcan valores que no sean del tipo double<p>




