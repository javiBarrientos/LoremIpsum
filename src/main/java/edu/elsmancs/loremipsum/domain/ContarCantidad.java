package edu.elsmancs.loremipsum.domain;

import java.util.*;

import static java.util.stream.Collectors.toMap;

public class ContarCantidad {
    private static final String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec et faucibus mi. Aenean vestibulum arcu quis risus mattis iaculis. Aenean eu arcu at libero suscipit dictum in vel arcu. Aliquam eros turpis, fringilla in elementum aliquam, aliquam sed est. Donec eu orci eget quam eleifend scelerisque nec vel ex. Nam dapibus placerat orci in imperdiet. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Suspendisse tincidunt pellentesque magna eu consectetur. Etiam volutpat blandit orci vel varius. Curabitur quis mauris pulvinar lorem pulvinar ornare in vitae enim. Aenean fermentum, sem sed consequat finibus, diam massa finibus massa, at lacinia ipsum urna id mi. Nunc finibus congue ullamcorper. Cras dui augue, ultricies non magna nec, tempus facilisis purus. In fringilla congue risus, sed ultricies neque posuere a. Fusce sit amet porttitor orci, sed cursus leo.\n" +
            "\n" +
            "Ut ac faucibus mi. Maecenas dolor nibh, mollis sit amet lacus id, hendrerit bibendum ante. Quisque imperdiet tincidunt pulvinar. Nullam sapien purus, tempor non semper et, suscipit eget metus. In non lacinia purus. Maecenas vel vulputate nisi. Morbi iaculis vitae est a aliquet. Suspendisse placerat congue neque non interdum. Nunc bibendum euismod suscipit.\n" +
            "\n" +
            "Cras tincidunt, nunc vel suscipit dictum, nunc nunc sollicitudin lacus, vitae ornare nulla lorem a nisl. Pellentesque ornare urna at ullamcorper consequat. Mauris fermentum ipsum ac lorem interdum sollicitudin. Praesent egestas odio est, eget sagittis augue lobortis non. Sed commodo eu risus non maximus. Morbi aliquam hendrerit justo, id consequat sapien efficitur id. Nunc imperdiet velit mi, quis vulputate nibh ultrices vel. Nunc in hendrerit metus. Praesent gravida nisl eget dignissim dapibus. Etiam eget neque magna. Pellentesque tincidunt mi in sapien volutpat, vel semper neque ornare. In finibus ornare mattis. Donec metus augue, vestibulum quis posuere vitae, laoreet ut ex.\n" +
            "\n" +
            "Maecenas nulla leo, blandit ut quam sit amet, bibendum sodales eros. Fusce nisl mauris, aliquam id dolor nec, lacinia interdum erat. In id elit dignissim diam bibendum feugiat non ac lacus. Fusce a turpis eget ante malesuada semper. Aliquam non finibus lacus, ut pulvinar urna. Vivamus ac ultricies purus. Duis maximus quam id neque aliquam rhoncus. Vestibulum ligula mi, faucibus ut sapien feugiat, pharetra imperdiet nibh. Sed fermentum enim vitae est eleifend egestas. Etiam tempus mauris quis turpis placerat, in pulvinar quam consectetur. Ut laoreet neque ut ligula porta, ac gravida odio mollis. In dignissim turpis eu purus posuere, quis fringilla arcu lobortis.\n" +
            "\n" +
            "Donec vel laoreet eros. Nulla imperdiet ex ut nisl mattis, nec gravida leo fermentum. Fusce ut elementum metus, tincidunt consequat dui. Nullam suscipit magna nec libero bibendum laoreet. Vivamus congue auctor est ac bibendum. Proin condimentum ante eros, vitae tristique enim euismod quis. Ut quis augue quis sem rutrum tempor. Donec sollicitudin imperdiet bibendum. Donec nec felis justo.";
    public ContarCantidad() {
    }

    public static String getLoremIpsum() {
        return loremIpsum;
    }

    public static int contarFrases() {
        String[] frase = getLoremIpsum().split("[!?.]+");
        return frase.length;
    }

    public static int contarPalabras() {
        String[] palabras = getLoremIpsum().split("\\s+");
        return palabras.length;
    }

    public static int contarParrafos() {
        String[] parrafos = getLoremIpsum().split("\\n+");
        return parrafos.length;
    }

    public static ArrayList<String> listarPalabras(String palabra) {
        ArrayList<String> listaDePalabras = new ArrayList<String>();
        String palabraVacia = "";

        String minimizarPalabra = palabra.toLowerCase();

        for (int i = 0; i < minimizarPalabra.length(); i++) {
            char posicionLetra = minimizarPalabra.charAt(i);

            if (posicionLetra != ' ') {
                palabraVacia += posicionLetra;

            } else {
                String palabraLimpia = palabraVacia.replaceAll("[.,:;!?]", "");
                listaDePalabras.add(palabraLimpia);
                palabraVacia = "";
            }
        }
        return listaDePalabras;
    }

    public static ArrayList<String> contarPalindromos(ArrayList<String> listaDePalabras) {
        ArrayList<String> listaPalindromos = new ArrayList<String>();

        for (String palabra : listaDePalabras) {
            String palabraGirada = new StringBuilder(palabra).reverse().toString();

            if (palabra.equals(palabraGirada) && palabraGirada.length() >= 3) {
                listaPalindromos.add(palabraGirada);
            }
        }
        return listaPalindromos;
    }

    public static Map<String, Integer> palabrasMasRepetidas(ArrayList<String> lista) {
        Map<String, Integer> palabrasRepetidas = new HashMap<String, Integer>();

        for (String palabraDeLaLista : lista) {
            palabrasRepetidas.put(palabraDeLaLista, Collections.frequency(lista, palabraDeLaLista));
        }

        LinkedHashMap mapaOrdenado = palabrasRepetidas.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(5)
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (key, value) -> value,
                                LinkedHashMap::new));

        return mapaOrdenado;
    }
}
