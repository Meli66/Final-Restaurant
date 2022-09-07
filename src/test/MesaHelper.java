package test;

import domain.Mesa;
import service.MesaService;
public class MesaHelper {

	
	//metodos para la creacion de mesas...
		public static Mesa crearMesax2(MesaService service) {
			return service.crear(2);
		}

		public static Mesa crearMesax4(MesaService service) {
			return service.crear(4);
		}

		public static Mesa crearMesax6(MesaService service) {
			return service.crear(6);
		}	
	}
	
	
	
	
	

