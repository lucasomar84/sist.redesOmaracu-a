import requests
    
if __name__ == '__main__':
    url = 'https://apis.datos.gob.ar/georef/api/provincias?campos=id,nombre'
    response = requests.get(url)
   
    print(response)
    
    if response.status_code == 200:
        print(response.content)
        
f = open("tarea.txt", "w")
f.write(response.text)
f.close()