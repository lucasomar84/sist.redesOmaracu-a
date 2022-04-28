import requests 
  
response = requests.get('https://api.genderize.io?name=peter&country_id=US') 
  
body = response.json()
print(body) 
print(response.headers) 

cuerpo = open("cuerpo.txt", "w")
cuerpo.write(str(body))
cuerpo.close()

encabezado = open("encabezado.txt", "w")
encabezado.write(str(response.headers))
encabezado.close()