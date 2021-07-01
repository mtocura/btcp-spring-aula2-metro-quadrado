# Aula 2 - Estender métodos web e JSON - TM

## Calculadora de metros quadrados

Resolução do exercício em grupo sobre a calculadora de metros quadrados

- POST ````(/aula2/tm/casa)`````
  - body request
  ````
  {
    "nome": "Casa Monstro",
    "endereco": "Rua dos loucos, 0",
    "comodos": [
        {
            "nome": "Quarto",
            "largura": 10.0,
            "comprimento": 10.0
        },
        {
            "nome": "Sala",
            "largura": 15.0,
            "comprimento": 10.0
        },
        {
            "nome": "Cozinha",
            "largura": 5.0,
            "comprimento": 8.0
        },
        {
            "nome": "Banheiro",
            "largura": 2.5,
            "comprimento": 2
        }
    ]
  }
  ````
  - body response:
  ````
  {
    "nome": "Casa Monstro",
    "endereco": "Rua dos loucos, 0",
    "comodos": [
        {
            "nome": "Quarto",
            "largura": 10.0,
            "comprimento": 10.0
        },
        {
            "nome": "Sala",
            "largura": 15.0,
            "comprimento": 10.0
        },
        {
            "nome": "Cozinha",
            "largura": 5.0,
            "comprimento": 8.0
        },
        {
            "nome": "Banheiro",
            "largura": 2.5,
            "comprimento": 2.0
        }
    ],
    "metrosQuadrados": 295.0,
    "valor": 236000.0,
    "maiorComodo": {
        "nome": "Sala",
        "largura": 15.0,
        "comprimento": 10.0
    },
    "comodoMetroQuadrado": {
        "Banheiro": 5.0,
        "Sala": 150.0,
        "Quarto": 100.0,
        "Cozinha": 40.0
    }
  }
  ````
