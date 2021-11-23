package cl.ucn.sistemaucr.logica;

import cl.ucn.sistemaucr.dominio.*;

public class SistemaUCRImpl implements SistemaUCR {
	private ListaAlumnos alumnos;
	private ListaProfesores profesores;
	private ListaAsignaturas asignaturas;
	private ListaParalelos paralelos;
	
	public SistemaUCRImpl() {
		alumnos = new ListaAlumnos(1000);
		profesores = new ListaProfesores(1000);
		asignaturas = new ListaAsignaturas(1000);
		paralelos = new ListaParalelos(1000);
	}
	
	@Override
	public boolean ingresarAlumno(String rut, String correo, int nivel, String contrasena) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ingresarAsignaturaObligatoria(String codigo, String nombre, int creditos,
			int nivel, String[] prerrequisitos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ingresarAsignaturaOpcional(String codigo, String nombre, int creditos, 
			int creditosPrerrequisito) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ingresarProfesor(String rut, String correo, String contrasena, int salario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ingresarParalelo(int numero, String codigo, String rutProfesor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean asociarNotaAlumno(String correoAlumno, String codigoAsignatura, double nota) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean asociarParaleloAlumno(String correoAlumno, String codigoAsignatura,
			int numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validarAlumno(String correo, String contrasena) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validarProfesor(String correo, String contrasena) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int verificarFecha(String fecha) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obtenerAsignaturasDisponibles(String correoAlumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerParalelosDisponibles(String codigoAsignatura) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verificarCreditos(String correoAlumno, String codigoAsignatura, int numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String obtenerAsignaturasInscritas(String correoAlumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarAsignaturaInscrita(String correoAlumno, String codigoAsignatura) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String obtenerParalelosProfesor(String correoProfesor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerAlumnosInscritos(String codigoAsignatura, int numeroParalelo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerInfoAlumnosEgresados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerInfoEstudiantes() {
		// TODO Auto-generated method stub
		return null;
	}
	
}