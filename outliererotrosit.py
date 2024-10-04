import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# Membaca data dari spreadsheet
file_path = 'D:\TELKOM\MATERI PERKULIAHAN\Telkom\Semester 5\Penambagan Data\\Eritrosit.xlsx'  # Ganti dengan nama file spreadsheet Anda
df = pd.read_excel(file_path)

# Asumsi kolom yang berisi data yang akan digunakan untuk boxplot
data = df['Eritrosit'].dropna().values

# Menghitung lima nilai penting
minimum = np.min(data)
Q1 = np.percentile(data, 25)
median = np.median(data)
Q3 = np.percentile(data, 75)
maximum = np.max(data)

# Menghitung IQR
IQR = Q3 - Q1

# Mencari batas bawah dan atas untuk mendeteksi outlier
lower_bound = Q1 - 1.5 * IQR
upper_bound = Q3 + 1.5 * IQR

# Menampilkan hasil perhitungan
print(f"Minimum: {minimum}")
print(f"Kuartil Pertama (Q1): {Q1}")
print(f"Median (Q2): {median}")
print(f"Kuartil Ketiga (Q3): {Q3}")
print(f"Maksimum: {maximum}")
print(f"Interquartile Range (IQR): {IQR}")
print(f"Lower Bound for Outliers: {lower_bound}")
print(f"Upper Bound for Outliers: {upper_bound}")

# Membuat boxplot
plt.boxplot(data)
plt.title("Boxplot dari Data Eritrosit Perempuan")
plt.show()
