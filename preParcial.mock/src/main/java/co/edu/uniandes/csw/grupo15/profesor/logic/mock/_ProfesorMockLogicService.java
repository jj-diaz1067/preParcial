/* ========================================================================
 * Copyright 2014 grupo15
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 grupo15

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201408112050

*/

package co.edu.uniandes.csw.grupo15.profesor.logic.mock;
import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.csw.grupo15.profesor.logic.dto.ProfesorDTO;
import co.edu.uniandes.csw.grupo15.profesor.logic.api._IProfesorLogicService;

public abstract class _ProfesorMockLogicService implements _IProfesorLogicService {

	private Long id= new Long(1);
	protected List<ProfesorDTO> data=new ArrayList<ProfesorDTO>();

	public ProfesorDTO createProfesor(ProfesorDTO profesor){
		id++;
		profesor.setId(id);
		data.add(profesor);
		return profesor;
    }

	public List<ProfesorDTO> getProfesors(){
		return data; 
	}

	public ProfesorDTO getProfesor(Long id){
		for(ProfesorDTO data1:data){
			if(data1.getId().equals(id)){
				return data1;
			}
		}
		return null;
	}

	public void deleteProfesor(Long id){
	    ProfesorDTO delete=null;
		for(ProfesorDTO data1:data){
			if(data1.getId().equals(id)){
				delete=data1;
			}
		}
		if(delete!=null){
			data.remove(delete);
		} 
	}

	public void updateProfesor(ProfesorDTO profesor){
	    ProfesorDTO delete=null;
		for(ProfesorDTO data1:data){
			if(data1.getId().equals(id)){
				delete=data1;
			}
		}
		if(delete!=null){
			data.remove(delete);
			data.add(profesor);
		} 
	}	
}