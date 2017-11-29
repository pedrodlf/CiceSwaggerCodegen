package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.example.generated.api.EmpleadosApi;
import com.example.generated.model.DetalleEmpleado;
import com.example.generated.model.Pregunta;
import com.example.generated.model.ResultadoBusquedaEmpleado;

/**
 * @author Pedro DLF
 *
 */
@Controller
public class EmpleadoController implements EmpleadosApi {

	@Override
	public ResponseEntity<ResultadoBusquedaEmpleado> empleadosGet(byte[] cookie, String nombre, String apellidos,
			String empresa, String unidad, String telefono, String extension) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<DetalleEmpleado> empleadosIdEmpleadoGet(String idEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> empleadosIdEmpleadoPreguntasPost(String idEmpleado, Pregunta pregunta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> empleadosIdEmpleadoPut(String idEmpleado, String ubicacion, String localidad,
			String provincia, String estadoCivil, String telefono, String fechaDeNacimiento, String numeroDeCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<DetalleEmpleado> empleadosUsuarioUsuarioGet(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
