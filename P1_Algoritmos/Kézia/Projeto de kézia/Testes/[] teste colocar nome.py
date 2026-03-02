import sys
import pygame as pg
import configs

def put_name(self) -> None:
    def _render(game) -> None:
        name_bg = pg.image.load("images\\BG\\input_username.jpg")
        menu = pg.image.load("images\\elements\\home.png")
        game.screen.blit(pg.font.Font(
            game.generalFont, 120).render('2048', True, configs.CORES['WHITE']), (108, 60))
        game.screen.blit(name_bg, (0, 0))
        game.screen.blit(pg.transform.scale(menu, [50, 50]), (236, 494))
        game.screen.blit(pg.font.Font(game.generalFont, 45).render('OK', True, configs.CORES['WHITE']), (229, 371))

    active_colour = '#013df2'
    inactive_colour = '#33346b'
    ok_box = pg.Rect(118, 383, 289, 80)
    input_box = pg.Rect(118, 283, 289, 80)
    menu_box = pg.Rect(225, 483, 75, 75)

    _render(self)
    font_input = pg.font.Font(self.generalFont, 48)
    pg.draw.rect(self.screen, color := inactive_colour, input_box, 1, border_radius=15)
    pg.display.update()

    name = ''
    active = False
    input_name = False
    while not input_name:
        for event in pg.event.get():
            if event.type == pg.QUIT:
                pg.quit()
                sys.exit()
            elif event.type == pg.MOUSEBUTTONDOWN:
                active = True if input_box.collidepoint(event.pos) else False
                if ok_box.collidepoint(event.pos):
                    if len(name) >= 3:
                        self.username = name
                        input_name = True
                elif menu_box.collidepoint(event.pos):
                    self.draw_menu()
                    return None
                color = active_colour if active else inactive_colour
            elif event.type == pg.KEYDOWN:
                if event.key == pg.K_ESCAPE:
                    pg.quit()
                    sys.exit()
                if active:
                    if event.key == pg.K_RETURN:
                        if len(name) >= 3:
                            self.username = name
                            input_name = True
                    elif event.key == pg.K_BACKSPACE:
                        name = name[:-1]
                    else:
                        if font_input.render(name, True, configs.CORES['WHITE']).get_width() < 261:
                            name += event.unicode
        _render(self)
        if name == '' and color == inactive_colour:
            self.screen.blit(font_input.render('Username', True, configs.CORES['GRAY']), (155, 267))
        txt = font_input.render(name, True, configs.CORES['WHITE'])
        pg.draw.rect(self.screen, color, input_box, 1, border_radius=15)
        self.screen.blit(txt, (input_box.w - txt.get_width() // 2 - 26, 267))
        pg.display.update()
