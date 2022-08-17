package DevAppWeb;

@RestController
public class GreetingController {
	
	@PostMapping("/greeting")
	public String greeting(@ResquestParam(value = "nome") String nome, 
			@ResquestParam(value = "i") int id) {
		return "test" + nome;
	}

}
