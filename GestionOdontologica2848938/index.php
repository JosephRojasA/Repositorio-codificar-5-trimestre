<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>

<body>
	<?php
	require_once 'Controlador/Controlador.php';
	require_once 'Modelo/GestorCita.php';
	require_once 'Modelo/Cita.php';
	require_once 'Modelo/Paciente.php';
	require_once 'Modelo/Conexion.php';

	// Instanciar el controlador
	$controlador = new Controlador();

	// Depuración: Mostrar la acción recibida
	if (isset($_GET["accion"])) {
		echo "<script>console.log('Acción recibida: {$_GET["accion"]}');</script>";
	} else {
		echo "<script>console.log('No se recibió ninguna acción, cargando página de inicio.');</script>";
	}

	// Manejo de acciones
	if (isset($_GET["accion"])) {
		try {
			if ($_GET["accion"] == "asignar") {
				echo "<script>console.log('Cargando página de asignar cita');</script>";
				$controlador->cargarAsignar();
			} elseif ($_GET["accion"] == "consultar") {
				echo "<script>console.log('Cargando página de consulta de citas');</script>";
				$controlador->verPagina('Vista/html/consultar.php');
			} elseif ($_GET["accion"] == "cancelar") {
				echo "<script>console.log('Cargando página de cancelación de citas');</script>";
				$controlador->verPagina('Vista/html/cancelar.php');
			} elseif ($_GET["accion"] == "guardarCita") {
				// Depuración: Mostrar datos recibidos para guardar cita
				echo "<script>console.log('Datos recibidos para guardar cita:', {
					documento: '{$_POST["asignarDocumento"]}',
					medico: '{$_POST["medico"]}',
					fecha: '{$_POST["fecha"]}',
					hora: '{$_POST["hora"]}',
					consultorio: '{$_POST["consultorio"]}'
				});</script>";

				$controlador->agregarCita(
					$_POST["asignarDocumento"],
					$_POST["medico"],
					$_POST["fecha"],
					$_POST["hora"],
					$_POST["consultorio"]
				);
			} elseif ($_GET["accion"] == "consultarCita") {
				echo "<script>console.log('Consultando citas del documento:', '{$_GET["consultarDocumento"]}');</script>";
				$controlador->consultarCitas($_GET["consultarDocumento"]);
			} elseif ($_GET["accion"] == "cancelarCita") {
				echo "<script>console.log('Cancelando cita del documento:', '{$_POST["cancelarDocumento"]}');</script>";
				$controlador->cancelarCitas($_POST["cancelarDocumento"]);
			} elseif ($_GET["accion"] == "consultarPaciente") {
				echo "<script>console.log('Consultando paciente con documento:', '{$_GET["documento"]}');</script>";
				$controlador->consultarPaciente($_GET["documento"]);
			} elseif ($_GET["accion"] == "ingresarPaciente") {
				// Depuración: Mostrar datos recibidos para ingresar paciente
				echo "<script>console.log('Datos recibidos para ingresar paciente:', {
					documento: '{$_GET["PacDocumento"]}',
					nombres: '{$_GET["PacNombres"]}',
					apellidos: '{$_GET["PacApellidos"]}',
					nacimiento: '{$_GET["PacNacimiento"]}',
					sexo: '{$_GET["PacSexo"]}'
				});</script>";

				$controlador->agregarPaciente(
					$_GET["PacDocumento"],
					$_GET["PacNombres"],
					$_GET["PacApellidos"],
					$_GET["PacNacimiento"],
					$_GET["PacSexo"]
				);
			} elseif ($_GET["accion"] == "consultarHora") {
				echo "<script>console.log('Consultando horas disponibles para médico {$_GET["medico"]} en fecha {$_GET["fecha"]}');</script>";
				$controlador->consultarHorasDisponibles($_GET["medico"], $_GET["fecha"]);
			} else {
				echo "<script>console.log('Acción desconocida: {$_GET["accion"]}');</script>";
			}
		} catch (Exception $e) {
			// Manejo de errores con mensaje en consola
			echo "<script>console.error('Error en la acción: {$_GET["accion"]}. Mensaje: {$e->getMessage()}');</script>";
		}
	} else {
		// Cargar la página de inicio si no hay acción
		echo "<script>console.log('Cargando página de inicio');</script>";
		$controlador->verPagina('Vista/html/inicio.php');
	}
	?>
</body>

</html>
