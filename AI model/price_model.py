import pandas as pd
from sklearn.linear_model import LinearRegression
import joblib
import sys

# Mock dataset
data = {
    'category': [1, 2, 1, 2],  # 1=Electronics, 2=Fashion
    'demand_score': [5, 3, 8, 4],  # Scale 1-10
    'price': [500, 100, 600, 150]
}
df = pd.DataFrame(data)

# Train the model
X = df[['category', 'demand_score']]
y = df['price']
model = LinearRegression()
model.fit(X, y)

# Save the model
joblib.dump(model, 'price_model.pkl')

# For prediction (called from Java)
if len(sys.argv) == 3:
    category = int(sys.argv[1])
    demand_score = float(sys.argv[2])
    prediction = model.predict([[category, demand_score]])
    print(round(prediction[0], 2))