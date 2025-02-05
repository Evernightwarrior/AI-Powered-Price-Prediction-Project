# AI-Powered Price Prediction Microservice

## Project Description
This project is a microservice that predicts product prices based on category and demand score using a Machine Learning model. It integrates a **Python-based AI model** with a **Java Spring Boot REST API** and is deployed on **Heroku/AWS**.

## Tech Stack
- **Python** (Scikit-learn, Pandas, Joblib)
- **Java Spring Boot** (Spring Web, Spring Data JPA)
- **MySQL / H2 Database** (For storing transactions)
- **Heroku / AWS** (Cloud deployment)
- **Postman** (For API testing)

## System Architecture
1. **Python AI Model:** Trains on product data and predicts price.
2. **Spring Boot API:** Calls the Python script using `ProcessBuilder` and exposes a REST endpoint.
3. **Database:** Stores transaction logs.
4. **Cloud Deployment:** Deployed on Heroku/AWS.

## Installation & Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/yourrepo/ai-price-prediction.git
   cd ai-price-prediction
   ```
2. Install Python dependencies:
   ```bash
   pip install pandas scikit-learn joblib
   ```
3. Train and save the model:
   ```bash
   python price_model.py
   ```
4. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints
- **Predict Price:** `GET /predict?category=1&demandScore=8`
  - **Response:** `{ "predictedPrice": 500 }`
- **Check Status:** `GET /health`

## Features
✅ AI-powered price prediction
✅ REST API for easy integration
✅ Secure, scalable microservices architecture
✅ Cloud deployment-ready

## Deployment on Heroku
1. Push code to GitHub.
2. Connect repo to Heroku.
3. Deploy using:
   ```bash
   git push heroku main
   ```

## Future Enhancements
- Improve model accuracy with larger datasets
- Implement real-time training with dynamic data
- Optimize API response time using caching mechanisms

