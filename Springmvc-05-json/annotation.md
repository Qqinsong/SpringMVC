> @Controller // 说明这个类被Spring容器接管了
> 
补充另外三个同性质的注解：
> @Component // 组件
> @Service // 业务层
> @Repository //dao层

> @RequestMapping // 放在类上，代表父路径，放在方法上代表子路径
- 组合注解，不同的开头代表不同的请求方式
> @GetMapping
> @PostMapping
> @PutMapping
> @DeleteMapping
> @PatchMapping

> @RequestParam("username") 参数，在传递参数的时候 不管前端用不用,这个参数都要加上


> 使用restful风格的时候，要注意注解的使用
> 
    @RequestMapping("/r/t2/{a}/{b}")
    public String sayHello2(@PathVariable int a, @PathVariable int b, Model model){

> @Controller 它会走视图解析器，如果不想走视图解析器，配合@ResponseBody 注解来使用

> @RestController 返回json字符串统一解决，这个类里面的所有方法都返回字符串 
> 不用在每一个都添加@ResponseBody 的注解了，我们在前后端分离的项目中，一般都使用RestController 
> 前后端分离的项目在开发的过程中，肯定不会走视图解析器了