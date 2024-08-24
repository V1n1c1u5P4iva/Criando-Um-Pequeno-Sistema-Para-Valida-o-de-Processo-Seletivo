# Criando-Um-Pequeno-Sistema-Para-Valida-o-de-Processo-Seletivo

Este repositório contém um projeto Java que simula um processo seletivo, incluindo a seleção de candidatos, tentativa de contato e análise dos candidatos. Este projeto foi desenvolvido como parte de um desafio.

## Funcionalidades

- **Seleção de Candidatos:** Seleciona candidatos com base no salário pretendido e no salário base disponível.
- **Impressão dos Candidatos Selecionados:** Lista os candidatos que foram selecionados para a vaga.
- **Tentativa de Contato:** Realiza tentativas de contato com os candidatos selecionados, com até três tentativas por candidato.

## Estrutura do Código

- `selecaoDeCandidatos()`: Realiza a seleção dos candidatos com base no salário pretendido.
- `imprimirSelecionados(List<String> selecionados)`: Exibe os candidatos selecionados.
- `entrarEmContato(String candidato)`: Tenta realizar o contato com o candidato.
- `atender()`: Simula a resposta do candidato à tentativa de contato.
- `analisarCandidato(double salarioPretendido)`: Analisa se o candidato deve ser contatado, receber uma contraproposta, ou aguardar o resultado.

## Como Executar

1. Certifique-se de ter o [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.
2. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/Criando-Um-Pequeno-Sistema-Para-Valida-o-de-Processo-Seletivo.git
