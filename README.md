
 ____**در stateless اگر ما ده تا ابجکت (Bean) از یک کلاس بگیریم وقتی برای آخرین بار مقداری هرکدام از ابجکتها را تغییر دهیم همه مقدارهای ابجکتهای دیگر هم مانند آخرین تغییر عوض می شوند یعنی انگار در کانتینر ما ده ابجکت معادل با یک ابجکت است ولی در statefull هر ابجکت تغییرات خودش را دارد انگار که ده ابجکت جدا در کانتینر ما وجود دارد.
در stateless اگر دو اپلیکیشن بالا داشته باشیم که اینترفیس همنامی داشته باشند که کلاس stateless ای را ایمپلنت کرده باشند به مشکل و کانفیلیکت می خوریم و باید نامهایشان را عوض کنیم ولی در stateful مشکلی بوجود نمی آید .
اگر نخواهیم از انوتیشن @ejb که همان کار Injection (از ابجکت مورد نظر instance میگیرد و و درون container pool مربوط به ejb قرار می دهد ) استفاده کنیم می توانیم از context.lookup() استفاده کینم به طوریکه ادرس اینترفیس مربوطه را داده و jndi برای ما از آن Bean می سازد .
به این فرایند jndi می گوییند .
 Java name directory interface
 try {
     Context context = new InitialContext();
     Object o = context.lookup("java:global/FlightServiceStateLess!service.FlightServiceStateLess");
     flightServiceStateLess = (FlightServiceStateLess) o;
 } catch (NamingException e) {
     e.printStackTrace();
 }
 if (Objects.nonNull(flightServiceStateLess)) {
     flightServiceStateLess.getAirPlaneModel();
 }**____



 

