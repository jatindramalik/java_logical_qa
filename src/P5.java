public class P5 {

    //List of integer 

    public static Litst<Integer> addEvenNoToList(List<Integer> list){

       return list.stream().map(x->x%2==0?x+1:x).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> list = Arays.asList(1,2,8,7,6,9);

        System.out.println(addEvenNoToList(list));
    }


    @Test
    public void testAddEvenNoToList(){
                List<Integer> list = Arays.asList(1,2,8,7,6,9);


        List<Integer> newlist =  addEvenNoToList(list);

        assertEquals(newlist,)
    }

    
}

@RestConroller
public class EmployeeControler{

    @GetMapping("employee/{id}")
    public ResponseEntity<Employee> findEmployeeById(@PathVariable Integer id){

        Employee e = employeeService.findEmployeeById();


        return ResponseEntitye,HttpStatus.ok>;
    }
}
