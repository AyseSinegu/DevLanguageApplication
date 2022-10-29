package kodlama.io.devLanguage.dataAccess.abstracts;
import java.util.List;

import kodlama.io.devLanguage.entities.concretes.ProgrammingLanguage;



public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getId(int id);
	void pLanguageAdd(ProgrammingLanguage pLanguage);
	void pLanguageUpdate(ProgrammingLanguage pLanguage);
	void pLanguageDelete(int id);

}
