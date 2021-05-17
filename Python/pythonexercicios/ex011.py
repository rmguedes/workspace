largura = float(input('Largura da parede: '))
altura = float(input('Altura da parade: '))
area = largura * altura
tinta = area / 2
print('Sua parade tem a dimensão de {} x {} e sua área é de {:.2f} m².'.format(largura, altura, area))
print('Para pintar essa parede, você precisará de {:.2f} litros de tinta.'. format(tinta))
