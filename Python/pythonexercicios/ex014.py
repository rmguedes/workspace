# Exercício Python 14: Escreva um programa que converta uma temperatura digitando em graus Celsius
# e converta para graus Fahrenheit.
cel = float(input('Informe a temperatura em °C: '))
fah = ((9 * cel) / 5) + 32
print('A temperatura de {}°C corresponde a {:.1f}°F'.format(cel, fah))
