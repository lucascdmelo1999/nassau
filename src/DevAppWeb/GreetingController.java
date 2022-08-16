package DevAppWeb;

@RestController
public class GreetingController {
	
	@PostMapping("/greeting")
	public String greeting(@ResquestParam(value = "nome") String nome) {
		return "test" + nome;
	}

}
