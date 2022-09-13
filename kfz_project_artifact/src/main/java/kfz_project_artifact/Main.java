/**
 * 
 */
package kfz_project_artifact;

import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.sail.SailRepository;
import org.eclipse.rdf4j.sail.memory.MemoryStore;

/**
 * @author KochLau
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repository rep = new SailRepository(new MemoryStore());
		
		/*Namespace ex = Values.namespace("ex", "http://example.org/");
		IRI john = Values.iri(ex, "john");
		
		try (RepositoryConnection conn = rep.getConnection()) {
		}*/

	}

}
