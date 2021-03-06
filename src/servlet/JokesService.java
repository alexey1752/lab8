package servlet;

import java.util.Random;

public class JokesService {
    private static String[] jokes = {
            "А когда навигатор будет вести не по самой короткой дороге, а по самой ровной?",
            "В нас напрочь пропал дух авантюризма! Мы перестали покупать батон и отгрызать от него горбушку, пока идем до дома.",
            "Я русский. Я горжусь своей монархией. Ой, тобишь демократией.",
			"Увидев о себе надпись в подъезде, Анжела не обиделась, а написала рядом свой телефон.",
			"Самое неприятное в параллельной парковке - это свидетели.",
			"Легенду про то, что человек не может жить без работы придумали те, кто никогда не работал, для тех, кто никогда не отдыхал.",
			"Когда на тебе 2 кредита и ипотека, надпись \"Сбербанк всегда рядом\" звучит недоброжелательно."
    };

    public static String getRandomJoke(){
        return jokes[(int) (Math.random() * jokes.length)];
    }

}
