## Aplication Proposal

Our application is designed to serve as an email sending system using Amazon SES (Simple Email Service). The application allows users to send emails from a specified address, leveraging AWS's scalable infrastructure to ensure efficient and secure email delivery.

 #### 🚀 How to Run the Application

⚙️ Prerequisites
 
- Java 17+
- Maven
- An AWS account with access to the SES (Simple Email Service)
- Properly configured AWS credentials

1. #### Clone the Repository:

```bash
git clone https://github.com/yourusername/EmailService
cd EmailService
```

2. #### Set Up AWS Credentials in the .env File:
Create a `.env` file at the root of the project with the following content:

```plaintext
AWS_ACCESS_KEY_ID=your_access_key_id
AWS_SECRET_KEY=your_secret_key
AWS_REGION=us-east-1
```

Replace `your_access_key_id` and `your_secret_key` with your actual AWS credentials.


3. #### Run the Application:

```bash
mvn spring-boot:run
```

🔧 Technologies Used
- Java
- Spring Boot
- Amazon SES (Simple Email Service)
- dotenv-java
- Maven
- Git
- GitHub
- IntelliJ IDEA

📝 License
This project is licensed. See the [LICENSE](https://github.com/R2DWess/Email-service/blob/master/LICENSE) file for more details.


