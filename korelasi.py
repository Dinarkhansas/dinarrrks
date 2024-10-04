import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Membaca data dari spreadsheet
file_path = 'D:\TELKOM\MATERI PERKULIAHAN\Telkom\Semester 5\Penambagan Data\\Korelasi.xlsx'  # Ganti dengan file data Anda
df = pd.read_excel(file_path)

# Asumsi ada dua kolom bernama 'Hemoglobin' dan 'Eritrosit'
X = df['Hemoglobin']
Y = df['Eritrosit']

# Menghitung korelasi
correlation = X.corr(Y)

# Menampilkan nilai korelasi
print(f"Koefisien Korelasi antara Hemoglobin dan Eritrosit: {correlation}")

# Membuat scatter plot untuk visualisasi korelasi
plt.figure(figsize=(8, 6))
sns.scatterplot(x=X, y=Y)

# Menambahkan judul dan label
plt.title(f'Korelasi antara Hemoglobin dan Eritrosit\nKoefisien Korelasi : {correlation:.2f}')
plt.xlabel('Kadar Hemoglobin (g/dL)')
plt.ylabel('Jumlah Eritrosit (juta/µL)')

# Menampilkan plot
plt.show()
