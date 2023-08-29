# Spring Batch Örnek Projesi

Bu proje, Spring Batch framework'ünün kullanımını örneklemek için oluşturulmuş bir projedir. Spring Batch, toplu veri işleme senaryolarını kolayca yönetmek ve otomasyon sağlamak için kullanılan bir çerçevedir.

Proje Açıklaması
Bu proje, basit bir veri işleme senaryosunu simüle eder. CSV formatında bulunan kullanıcı verilerini okur, işler ve sonuçları veritabanına kaydeder. Temel bileşenler aşağıdaki gibidir:

Veri Okuma: CSV dosyasındaki kullanıcı verileri FlatFileItemReader kullanılarak okunur.
Veri İşleme: Okunan her kullanıcı verisi, CustomerItemProcessor ile işlenir. Bu işlem sırasında kullanıcı verileri üzerinde dönüşümler ve manipülasyonlar yapılabilir.
Veri Yazma: İşlenen kullanıcı verileri, JdbcBatchItemWriter kullanılarak veritabanına yazılır.
Zamanlanmış İş: @Scheduled annotasyonu kullanılarak belirli aralıklarla veri işleme işlemi otomatik olarak gerçekleştirilir.
Kullanım
Projenin ana dizinindeki src/main/resources klasörü altına User.csv adında örnek bir CSV dosyası ekleyin. Bu dosya içinde kullanıcı verilerini barındırmalıdır.

Veritabanı bağlantı bilgilerini src/main/resources/application.properties dosyasında yapılandırın.


bash
./mvnw spring-boot:run
Proje çalıştığında, belirli aralıklarla CSV dosyasındaki kullanıcı verileri işlenecek ve veritabanına kaydedilecektir.

