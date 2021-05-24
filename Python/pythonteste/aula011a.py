#modulo colorize, mais recursos de cores
# Exemplo 1
print('\033[4;30;45mOlá Mundo!\033[m')
print('\033[0;33;44mOlá Mundo!\033[m')
print('\033[7;33;44mOlá Mundo!\033[m')
# Exemplo 2
a = 3
b = 5
print('Os valores são \033[32m{} e \033[31m{}'.format(a, b))
# Exemplo 3 - Dicionário de Cores
nome = 'Ricardo'
cores = {'limpa':'\033[m',
         'azul':'\033[34m',
         'amarelo':'\033[33m',
         'pretoebranco':'\033[7;30m'}
print('Olá! Muito prazer em te conhecer, {}{}{}!!'.format(cores['pretoebranco'], nome, cores['limpa']))
print('Olá! Muito prazer em te conhecer, {}{}{}!!'.format('\033[4;34m', nome, '\033[m'))
