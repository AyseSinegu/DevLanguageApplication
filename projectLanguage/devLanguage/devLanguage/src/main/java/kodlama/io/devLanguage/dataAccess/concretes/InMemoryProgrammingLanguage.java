package kodlama.io.devLanguage.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devLanguage.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository{
	List<ProgrammingLanguage> progLanguages;
	
	public InMemoryProgrammingLanguage() {
		progLanguages=new ArrayList<ProgrammingLanguage>();
		progLanguages.add(new ProgrammingLanguage(0, "C#"));
		progLanguages.add(new ProgrammingLanguage(1, "Java"));
		progLanguages.add(new ProgrammingLanguage(2, "Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return progLanguages;
	}

	@Override
	public ProgrammingLanguage getId(int id) {
		for (ProgrammingLanguage programmingLanguage : progLanguages) {
		if(programmingLanguage.getId()==id) {
			return programmingLanguage;
		}
		}
		return null;
		
	}

	@Override
	public void pLanguageAdd(ProgrammingLanguage pLanguage) {
		this.progLanguages.add(pLanguage);
		
	}

	@Override
	public void pLanguageUpdate(ProgrammingLanguage pLanguage) {
		for (ProgrammingLanguage programmingLanguage : progLanguages) {
			if(pLanguage.getId()==programmingLanguage.getId()) {
				programmingLanguage.setName(pLanguage.getName());
			}
		}
		
	}

	@Override
	public void pLanguageDelete(int id) {
		this.progLanguages.remove(id);
		
	}
	
	

}
